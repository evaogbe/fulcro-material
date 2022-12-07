(ns ogbe.fulcro.mui.icons.router-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/RouterTwoTone" :default RouterTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-router-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RouterTwoTone)))