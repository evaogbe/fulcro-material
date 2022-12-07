(ns ogbe.fulcro.mui.icons.local-police
  #?(:cljs (:require
            ["@mui/icons-material/LocalPolice" :default LocalPolice]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-police
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPolice)))