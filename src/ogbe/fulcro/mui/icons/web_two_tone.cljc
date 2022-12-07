(ns ogbe.fulcro.mui.icons.web-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WebTwoTone" :default WebTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebTwoTone)))