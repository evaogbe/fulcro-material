(ns ogbe.fulcro.mui.icons.javascript
  #?(:cljs (:require
            ["@mui/icons-material/Javascript" :default Javascript]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-javascript
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Javascript)))