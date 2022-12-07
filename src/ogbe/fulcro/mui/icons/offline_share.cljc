(ns ogbe.fulcro.mui.icons.offline-share
  #?(:cljs (:require
            ["@mui/icons-material/OfflineShare" :default OfflineShare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-offline-share
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OfflineShare)))