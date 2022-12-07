(ns ogbe.fulcro.mui.icons.minor-crash
  #?(:cljs (:require
            ["@mui/icons-material/MinorCrash" :default MinorCrash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-minor-crash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MinorCrash)))