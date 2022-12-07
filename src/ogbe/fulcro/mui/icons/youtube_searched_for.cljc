(ns ogbe.fulcro.mui.icons.youtube-searched-for
  #?(:cljs (:require
            ["@mui/icons-material/YoutubeSearchedFor" :default YoutubeSearchedFor]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-youtube-searched-for
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory YoutubeSearchedFor)))