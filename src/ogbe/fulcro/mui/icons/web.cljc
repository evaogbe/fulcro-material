(ns ogbe.fulcro.mui.icons.web
  #?(:cljs (:require
            ["@mui/icons-material/Web" :default Web]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Web)))