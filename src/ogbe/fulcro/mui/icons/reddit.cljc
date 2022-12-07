(ns ogbe.fulcro.mui.icons.reddit
  #?(:cljs (:require
            ["@mui/icons-material/Reddit" :default Reddit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reddit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Reddit)))