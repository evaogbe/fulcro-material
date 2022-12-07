(ns ogbe.fulcro.mui.icons.web-asset
  #?(:cljs (:require
            ["@mui/icons-material/WebAsset" :default WebAsset]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-asset
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebAsset)))