(ns ogbe.fulcro.mui.icons.lyrics-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LyricsRounded" :default LyricsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lyrics-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LyricsRounded)))