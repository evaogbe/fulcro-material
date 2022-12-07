(ns ogbe.fulcro.mui.icons.lyrics
  #?(:cljs (:require
            ["@mui/icons-material/Lyrics" :default Lyrics]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lyrics
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Lyrics)))