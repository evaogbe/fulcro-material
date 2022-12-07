(ns ogbe.fulcro.mui.icons.videogame-asset
  #?(:cljs (:require
            ["@mui/icons-material/VideogameAsset" :default VideogameAsset]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-videogame-asset
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VideogameAsset)))