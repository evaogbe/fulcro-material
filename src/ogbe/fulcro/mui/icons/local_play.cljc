(ns ogbe.fulcro.mui.icons.local-play
  #?(:cljs (:require
            ["@mui/icons-material/LocalPlay" :default LocalPlay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-play
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPlay)))