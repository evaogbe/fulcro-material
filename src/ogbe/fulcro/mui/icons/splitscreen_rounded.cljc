(ns ogbe.fulcro.mui.icons.splitscreen-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SplitscreenRounded" :default SplitscreenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-splitscreen-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SplitscreenRounded)))