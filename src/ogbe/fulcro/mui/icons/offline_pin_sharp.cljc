(ns ogbe.fulcro.mui.icons.offline-pin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/OfflinePinSharp" :default OfflinePinSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-offline-pin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OfflinePinSharp)))