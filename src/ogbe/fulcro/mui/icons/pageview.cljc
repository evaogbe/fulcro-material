(ns ogbe.fulcro.mui.icons.pageview
  #?(:cljs (:require
            ["@mui/icons-material/Pageview" :default Pageview]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pageview
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pageview)))