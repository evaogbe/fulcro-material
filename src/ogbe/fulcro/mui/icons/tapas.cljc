(ns ogbe.fulcro.mui.icons.tapas
  #?(:cljs (:require
            ["@mui/icons-material/Tapas" :default Tapas]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tapas
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tapas)))