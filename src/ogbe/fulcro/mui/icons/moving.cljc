(ns ogbe.fulcro.mui.icons.moving
  #?(:cljs (:require
            ["@mui/icons-material/Moving" :default Moving]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-moving
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Moving)))