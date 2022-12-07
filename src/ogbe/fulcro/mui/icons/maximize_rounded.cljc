(ns ogbe.fulcro.mui.icons.maximize-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MaximizeRounded" :default MaximizeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-maximize-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MaximizeRounded)))