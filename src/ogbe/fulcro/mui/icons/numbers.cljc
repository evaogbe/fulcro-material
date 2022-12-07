(ns ogbe.fulcro.mui.icons.numbers
  #?(:cljs (:require
            ["@mui/icons-material/Numbers" :default Numbers]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-numbers
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Numbers)))