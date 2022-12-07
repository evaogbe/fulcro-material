(ns ogbe.fulcro.mui.icons.music-off
  #?(:cljs (:require
            ["@mui/icons-material/MusicOff" :default MusicOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-music-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MusicOff)))