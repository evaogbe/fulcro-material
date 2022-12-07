(ns ogbe.fulcro.mui.icons.lyrics-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LyricsOutlined" :default LyricsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lyrics-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LyricsOutlined)))