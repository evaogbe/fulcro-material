(ns ogbe.fulcro.mui.icons.room
  #?(:cljs (:require
            ["@mui/icons-material/Room" :default Room]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-room
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Room)))