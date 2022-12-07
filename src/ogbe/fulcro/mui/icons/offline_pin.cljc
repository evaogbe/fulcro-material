(ns ogbe.fulcro.mui.icons.offline-pin
  #?(:cljs (:require
            ["@mui/icons-material/OfflinePin" :default OfflinePin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-offline-pin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OfflinePin)))