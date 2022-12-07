(ns ogbe.fulcro.mui.icons.local-bar
  #?(:cljs (:require
            ["@mui/icons-material/LocalBar" :default LocalBar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalBar)))