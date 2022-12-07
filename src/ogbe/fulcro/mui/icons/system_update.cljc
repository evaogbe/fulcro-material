(ns ogbe.fulcro.mui.icons.system-update
  #?(:cljs (:require
            ["@mui/icons-material/SystemUpdate" :default SystemUpdate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-system-update
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SystemUpdate)))