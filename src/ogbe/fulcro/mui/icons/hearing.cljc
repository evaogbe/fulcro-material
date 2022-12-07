(ns ogbe.fulcro.mui.icons.hearing
  #?(:cljs (:require
            ["@mui/icons-material/Hearing" :default Hearing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hearing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hearing)))