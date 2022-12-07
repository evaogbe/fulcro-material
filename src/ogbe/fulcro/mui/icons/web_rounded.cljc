(ns ogbe.fulcro.mui.icons.web-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WebRounded" :default WebRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebRounded)))