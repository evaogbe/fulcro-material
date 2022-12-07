(ns ogbe.fulcro.mui.icons.girl
  #?(:cljs (:require
            ["@mui/icons-material/Girl" :default Girl]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-girl
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Girl)))