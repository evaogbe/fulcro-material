(ns ogbe.fulcro.mui.icons.forum
  #?(:cljs (:require
            ["@mui/icons-material/Forum" :default Forum]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-forum
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Forum)))