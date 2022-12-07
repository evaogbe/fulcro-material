(ns ogbe.fulcro.mui.icons.art-track
  #?(:cljs (:require
            ["@mui/icons-material/ArtTrack" :default ArtTrack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-art-track
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArtTrack)))