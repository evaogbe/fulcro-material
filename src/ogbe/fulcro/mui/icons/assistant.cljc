(ns ogbe.fulcro.mui.icons.assistant
  #?(:cljs (:require
            ["@mui/icons-material/Assistant" :default Assistant]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assistant
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Assistant)))