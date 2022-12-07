(ns ogbe.fulcro.mui.icons.aod
  #?(:cljs (:require
            ["@mui/icons-material/Aod" :default Aod]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-aod
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Aod)))