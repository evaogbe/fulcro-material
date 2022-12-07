(ns ogbe.fulcro.mui.icons.output
  #?(:cljs (:require
            ["@mui/icons-material/Output" :default Output]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-output
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Output)))