(ns ogbe.fulcro.mui.icons.link-off
  #?(:cljs (:require
            ["@mui/icons-material/LinkOff" :default LinkOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-link-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinkOff)))