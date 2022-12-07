(ns ogbe.fulcro.mui.icons.https
  #?(:cljs (:require
            ["@mui/icons-material/Https" :default Https]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-https
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Https)))