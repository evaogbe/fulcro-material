(ns ogbe.fulcro.mui.icons.offline-bolt
  #?(:cljs (:require
            ["@mui/icons-material/OfflineBolt" :default OfflineBolt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-offline-bolt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OfflineBolt)))