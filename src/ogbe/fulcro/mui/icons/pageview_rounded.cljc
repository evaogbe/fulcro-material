(ns ogbe.fulcro.mui.icons.pageview-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PageviewRounded" :default PageviewRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pageview-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PageviewRounded)))