(ns ogbe.fulcro.mui.icons.web-asset-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WebAssetRounded" :default WebAssetRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-asset-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebAssetRounded)))