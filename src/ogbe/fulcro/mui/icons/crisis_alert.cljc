(ns ogbe.fulcro.mui.icons.crisis-alert
  #?(:cljs (:require
            ["@mui/icons-material/CrisisAlert" :default CrisisAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crisis-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CrisisAlert)))