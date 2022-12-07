(ns ogbe.fulcro.mui.icons.euro
  #?(:cljs (:require
            ["@mui/icons-material/Euro" :default Euro]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-euro
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Euro)))