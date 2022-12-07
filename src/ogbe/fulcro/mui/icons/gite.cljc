(ns ogbe.fulcro.mui.icons.gite
  #?(:cljs (:require
            ["@mui/icons-material/Gite" :default Gite]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gite
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Gite)))