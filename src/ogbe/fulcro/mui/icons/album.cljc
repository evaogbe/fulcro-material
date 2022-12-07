(ns ogbe.fulcro.mui.icons.album
  #?(:cljs (:require
            ["@mui/icons-material/Album" :default Album]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-album
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Album)))