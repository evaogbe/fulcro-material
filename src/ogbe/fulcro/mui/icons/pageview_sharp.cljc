(ns ogbe.fulcro.mui.icons.pageview-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PageviewSharp" :default PageviewSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pageview-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PageviewSharp)))