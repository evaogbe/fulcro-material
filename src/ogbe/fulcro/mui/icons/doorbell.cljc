(ns ogbe.fulcro.mui.icons.doorbell
  #?(:cljs (:require
            ["@mui/icons-material/Doorbell" :default Doorbell]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-doorbell
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Doorbell)))