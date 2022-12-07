(ns ogbe.fulcro.mui.icons.gif
  #?(:cljs (:require
            ["@mui/icons-material/Gif" :default Gif]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gif
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Gif)))