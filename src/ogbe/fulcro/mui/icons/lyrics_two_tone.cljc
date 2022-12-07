(ns ogbe.fulcro.mui.icons.lyrics-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LyricsTwoTone" :default LyricsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lyrics-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LyricsTwoTone)))