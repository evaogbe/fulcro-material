(ns ogbe.fulcro.mui.icons.html
  #?(:cljs (:require
            ["@mui/icons-material/Html" :default Html]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-html
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Html)))