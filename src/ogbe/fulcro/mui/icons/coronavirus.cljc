(ns ogbe.fulcro.mui.icons.coronavirus
  #?(:cljs (:require
            ["@mui/icons-material/Coronavirus" :default Coronavirus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-coronavirus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Coronavirus)))