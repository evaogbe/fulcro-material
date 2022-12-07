(ns ogbe.fulcro.mui.icons.auto-awesome-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AutoAwesomeRounded" :default AutoAwesomeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-awesome-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoAwesomeRounded)))