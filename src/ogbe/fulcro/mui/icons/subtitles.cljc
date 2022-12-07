(ns ogbe.fulcro.mui.icons.subtitles
  #?(:cljs (:require
            ["@mui/icons-material/Subtitles" :default Subtitles]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subtitles
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Subtitles)))