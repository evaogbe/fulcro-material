(ns ogbe.fulcro.mui.icons.lyrics-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LyricsSharp" :default LyricsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lyrics-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LyricsSharp)))