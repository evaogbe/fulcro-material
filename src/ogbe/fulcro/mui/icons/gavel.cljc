(ns ogbe.fulcro.mui.icons.gavel
  #?(:cljs (:require
            ["@mui/icons-material/Gavel" :default Gavel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gavel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Gavel)))