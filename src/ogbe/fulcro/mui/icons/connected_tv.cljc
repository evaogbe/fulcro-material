(ns ogbe.fulcro.mui.icons.connected-tv
  #?(:cljs (:require
            ["@mui/icons-material/ConnectedTv" :default ConnectedTv]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-connected-tv
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ConnectedTv)))